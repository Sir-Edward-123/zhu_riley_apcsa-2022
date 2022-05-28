import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void grayScale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
				pixelObj.setRed(average);
				pixelObj.setGreen(average);
				pixelObj.setBlue(average);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(pixelObj.getRed() - 255);
				pixelObj.setGreen(pixelObj.getGreen() - 255);
				pixelObj.setBlue(pixelObj.getBlue() - 255);
			}
		}
	}

	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(pixelObj.getRed() * 7);
				pixelObj.setGreen(pixelObj.getGreen() * 7);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int col = 0; col < width; col++) {
			for (int row = 0; row < pixels.length / 2; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[pixels.length - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int col = 0; col < width; col++) {
			for (int row = 0; row < pixels.length / 2; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[pixels.length - 1 - row][col];
				topPixel.setColor(bottomPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topDiagPixel = null;
		Pixel bottomDiagPixel = null;
		int width = pixels[0].length;
		int stopIndex;
		if (width <= pixels.length) {
			stopIndex = width;
		} else {
			stopIndex = pixels.length;
		}

		for (int row = 0; row < stopIndex; row++) {
			for (int col = 0; col < row; col++) {
				topDiagPixel = pixels[col][row];
				bottomDiagPixel = pixels[row][col];
				topDiagPixel.setColor(bottomDiagPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	public void mirrorArms() {
		int mirrorPoint = 225;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 163; row < mirrorPoint; row++) {
			for (int col = 100; col < 300; col++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorGull() {
		int mirrorPoint = 370;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 224; row < 340; row++) {
			for (int col = 232; col < mirrorPoint; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < endRow
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < endCol
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("src/images/flower1.jpg");
		Picture flower2 = new Picture("src/images/flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}
	
	public void myCollage() {
		Picture whiteFlower = new Picture("src/images/whiteFlower.jpg");
		
		Picture blueDog = new Picture("src/images/doggo.jpg");
		blueDog.keepOnlyBlue();
		blueDog.mirrorVertical();
		whiteFlower.copy(blueDog, 0, 400);
		
		Picture redDog = new Picture("src/images/doggo.jpg");
		redDog.keepOnlyRed();
		whiteFlower.copy(redDog, 100, 100);
		
		Picture greenDog = new Picture("src/images/doggo.jpg");
		greenDog.keepOnlyGreen();
		greenDog.mirrorHorizontal();
		whiteFlower.copy(greenDog, 200, 300);
		
		this.copy(whiteFlower, 0, 0);
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}
	
	public void edgeDetection2(int edgeDist) {
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color bottomColor = null;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < pixels.length - 1; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[row + 1][col];
				bottomColor = bottomPixel.getColor();
				if (topPixel.colorDistance(bottomColor) > edgeDist)
					topPixel.setColor(Color.BLACK);
				else
					topPixel.setColor(Color.WHITE);
			}
		}
	}
	
	public void chromakey() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if(pixelObj.getBlue() > pixelObj.getRed() && pixelObj.getBlue() > pixelObj.getGreen()) {
					// Setting alpha doesn't appear to be changing the transparency, so I just made the background red instead.
					// pixelObj.setAlpha(0);
					pixelObj.setColor(Color.red);
				}
			}
		}
	}
	
	public void encodeAndDecode() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Color leftColor = null;
		Color rightColor = null;
		
		for(int row = 0; row < pixels.length; row++) {
			for(int col = 0; col < pixels[0].length/2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][pixels[0].length - 1 - col];
				leftColor = leftPixel.getColor();
				rightColor = rightPixel.getColor();
				
				leftPixel.setColor(rightColor);
				rightPixel.setColor(leftColor);
			}
		}
	}
	
	public int getCountRedOverValue(int value) {
		Pixel[][] pixels = this.getPixels2D();
		int count = 0;
		
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if(pixelObj.getRed() > value) {
					count++;
				}
			}
		}
		return count;
	}
	
	public void setRedToHalfValueInTopHalf() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel pixel = null;
		for (int row = 0; row < pixels.length / 2; row++) {
			for(int col = 0; col < pixels[0].length; col++) {
				pixel = pixels[row][col];
				pixel.setRed(pixel.getRed() / 2);
			}
		}
	}
	
	public void clearBlueOverValue(int value) {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if(pixelObj.getBlue() > value) {
					pixelObj.setBlue(0);
				}
			}
		}
	}
	
	public double getAverageForColumn(int col) {
		Pixel[][] pixels = this.getPixels2D();
		Pixel pixel = null;
		int totalRGB = 0;
		for (Pixel[] rowArray : pixels) {
			pixel = rowArray[col];
			totalRGB += pixel.getRed() + pixel.getGreen() + pixel.getBlue();
		}
		return (double) totalRGB / (pixels.length * 3);
	}
	
	public void encode(Picture message) {
		Pixel[][] pixels = this.getPixels2D();
		Pixel[][] messagePixels = message.getPixels2D();
		Pixel currPix;
		for(int row = 0; row < pixels.length; row++) {
			for(int col = 0; col < pixels[0].length; col++) {
				currPix = pixels[row][col];
				if(row < messagePixels.length && col < messagePixels[0].length) {
					if(countOnes(Integer.toBinaryString(currPix.getRed()))%2 == 1) {
						if(currPix.getRed()%2 == 1) {
							currPix.setRed(currPix.getRed() - 1);
						} else {
							currPix.setRed(currPix.getRed() + 1);
						}
					}
					if(countOnes(Integer.toBinaryString(currPix.getGreen()))%2 == 1 && messagePixels[row][col].colorDistance(Color.white) < 50) {
						if(currPix.getGreen()%2 == 1) {
							currPix.setGreen(currPix.getGreen() - 1);
						} else {
							currPix.setGreen(currPix.getGreen() + 1);
						}
					} else if(countOnes(Integer.toBinaryString(currPix.getGreen()))%2 == 0 && messagePixels[row][col].colorDistance(Color.black) < 50) {
						if(currPix.getGreen()%2 == 1) {
							currPix.setGreen(currPix.getGreen() - 1);
						} else {
							currPix.setGreen(currPix.getGreen() + 1);
						}
					}
				} else {
					if(countOnes(Integer.toBinaryString(currPix.getRed()))%2 == 0) {
						if(currPix.getRed()%2 == 1) {
							currPix.setRed(currPix.getRed() - 1);
						} else {
							currPix.setRed(currPix.getRed() + 1);
						}
					}
				}	
			}
		}
		
	}
	
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int numRow;
		int numCol;
		for(numRow = 0; numRow < pixels.length; numRow++) {
			if(countOnes(Integer.toBinaryString(pixels[numRow][0].getRed()))%2 == 1) {
				break;
			}
		}
		for(numCol = 0; numCol < pixels[0].length; numCol++) {
			if(countOnes(Integer.toBinaryString(pixels[0][numCol].getRed()))%2 == 1) {
				break;
			}
		}
		
		Picture decodePicture = new Picture(numRow, numCol);
		Pixel[][] decodePixels = decodePicture.getPixels2D();
		for(int row = 0; row < decodePixels.length; row++) {
			for(int col = 0; col < decodePixels[0].length; col++) {
				if(countOnes(Integer.toBinaryString(pixels[row][col].getGreen()))%2 == 1) {
					decodePixels[row][col].setColor(Color.black);
				} else {
					decodePixels[row][col].setColor(Color.white);
				}
			}
		}
		
		return decodePicture;
	}
	
	public int countOnes(String binaryString) {
		int oneCount = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') {
				oneCount++;
			}
		}
		return oneCount;
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
