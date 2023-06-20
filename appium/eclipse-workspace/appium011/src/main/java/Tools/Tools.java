package Tools;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tools {
	public boolean verifyImage(String image1, String image2) throws IOException{
	    File fileInput = new File(image1);
	    File fileOutPut = new File(image2);

	    BufferedImage bufileInput = ImageIO.read(fileInput);
	    DataBuffer dafileInput = bufileInput.getData().getDataBuffer();
	    int sizefileInput = dafileInput.getSize();                     
	    BufferedImage bufileOutPut = ImageIO.read(fileOutPut);
	    DataBuffer dafileOutPut = bufileOutPut.getData().getDataBuffer();
	    int sizefileOutPut = dafileOutPut.getSize();
	    Boolean matchFlag = true;
	    if(sizefileInput == sizefileOutPut) {                         
	       for(int j=0; j<sizefileInput; j++) {
	             if(dafileInput.getElem(j) != dafileOutPut.getElem(j)) {
	                   matchFlag = false;
	                   break;
	             }
	        }
	    }
	    else                            
	       matchFlag = false;
	    return matchFlag;
	}

}
