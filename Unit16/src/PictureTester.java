/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("src/images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testKeepOnlyRed() {
		Picture butterfly = new Picture("src/images/butterfly1.jpg");
		butterfly.explore();
		butterfly.keepOnlyRed();
		butterfly.explore();
	}

	public static void testKeepOnlyGreen() {
		Picture butterfly = new Picture("src/images/butterfly1.jpg");
		butterfly.explore();
		butterfly.keepOnlyGreen();
		butterfly.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture butterfly = new Picture("src/images/butterfly1.jpg");
		butterfly.explore();
		butterfly.keepOnlyBlue();
		butterfly.explore();
	}

	public static void testNegate() {
		Picture wall = new Picture("src/images/wall.jpg");
		wall.explore();
		wall.negate();
		wall.explore();
	}

	public static void testGrayscale() {
		Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.grayScale();
		motorcycle.explore();
	}

	public static void testFixUnderwater() {
		Picture water = new Picture("src/images/water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("src/images/caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	public static void testMirrorVerticalRightToLeft() {
		Picture koala = new Picture("src/images/koala.jpg");
		koala.explore();
		koala.mirrorVerticalRightToLeft();
		koala.explore();
	}

	public static void testMirrorHorizontal() {
		Picture seagull = new Picture("src/images/seagull.jpg");
		seagull.explore();
		seagull.mirrorHorizontal();
		seagull.explore();
	}

	public static void testMirrorHorizontalBotToTop() {
		Picture moon = new Picture("src/images/moon-surface.jpg");
		moon.explore();
		moon.mirrorHorizontalBotToTop();
		moon.explore();
	}

	public static void testMirrorDiagonal() {
		Picture arch = new Picture("src/images/arch.jpg");
		arch.explore();
		arch.mirrorDiagonal();
		arch.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("src/images/temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	public static void testMirrorArms() {
		Picture snowman = new Picture("src/images/snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}

	public static void testMirrorGull() {
		Picture seagull = new Picture("src/images/seagull.jpg");
		seagull.explore();
		seagull.mirrorGull();
		seagull.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("src/images/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	public static void testCopy() {
		Picture fromPic = new Picture("src/images/gorge.jpg");
		Picture toPic = new Picture("src/images/thruDoor.jpg");
		toPic.copy(fromPic, 0, 100, 0, 60);
		toPic.explore();
	}
	
	public static void testMyCollage() {
		Picture canvas = new Picture("src/images/640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("src/images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testEdgeDetection2() {
		Picture swan = new Picture("src/images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testChromakey() {
		Picture mark = new Picture("src/images/blue-mark.jpg");
		mark.explore();
		mark.chromakey();
		mark.explore();
	}
	
	public static void testGetCountRedOverValue(int value) {
		Picture flower = new Picture("src/images/flower2.jpg");
		System.out.println(flower.getCountRedOverValue(value));
	}
	
	public static void testEncodeAndDecode() {
		Picture msg = new Picture("src/images/msg.jpg");
		msg.explore();
		msg.encodeAndDecode();
		msg.explore();
	}
	
	public static void testSetRedToHalfValueInTopHalf()
	{
		Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.setRedToHalfValueInTopHalf();
		motorcycle.explore();
	}
	
	public static void testClearBlueOverValue(int value) {
		Picture motorcycle = new Picture("src/images/blueMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.clearBlueOverValue(value);
		motorcycle.explore();
	}
	
	public static void testGetAverageForColumn(int value) {
		// Not exactly sure what to do for this one, so I just averaged all the RGB values in one column
		Picture hall = new Picture("src/images/femaleLionAndHall.jpg");
		hall.explore();
		System.out.println(hall.getAverageForColumn(value));
	}
	
	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizontal();
		// testMirrorHorizontalBotToTop();
		// testMirrorDiagonal();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testCollage();
		// testCopy();
		// testMyCollage();
		// testEdgeDetection();
		// testEdgeDetection2();
		
		// I'm not exactly sure what to do for the ones below but I tried
		// to write the methods based on their names
		
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}