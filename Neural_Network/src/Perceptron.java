import java.util.Arrays;

public class Perceptron {
	private int threshold;
	private double learningRate;
	private double[] weights;
	private double bias;
	
	public Perceptron(int numInputs, int threshold, int learningRate) {
		this.threshold = threshold;
		this.learningRate = learningRate;
		this.weights = new double[numInputs];
		this.bias = 0;
		
		System.out.println("Initial Weights: " + Arrays.toString(this.weights));
		System.out.println("Initial Bias: " + this.bias);
		System.out.println("Threshold: " + this.threshold);
		System.out.println("Learning Rate: " + this.learningRate);
	}
	
	public int predict(int[] inputs) {
		double z = inputs[0] * weights[0] + inputs[1] * weights[1] + bias;
		System.out.println("z = " + inputs[0] + "*" + weights[0] + "+" + inputs[1] + "*" + weights[1]);
		
		int activation;
		if(z > 0) {
			activation = 1;
		} else {
			activation = 0;
		}
		return activation;
	}
	
	public void train(int[][] trainingInputs, int[] labels) {
		for(int i = 0; i < threshold; i++) {
			System.out.println("--------Training Iteration: " + i + "--------");
			for(int j = 0; j < trainingInputs.length; j++) {
				System.out.println("Current inputs, weight, bias: " + Arrays.toString(trainingInputs[j]) + " " + Arrays.toString(weights) + " " + bias);
				int yhat = predict(trainingInputs[j]);
				System.out.println("Activation(yhat) = " + yhat);
				int error = labels[j] - yhat;
				System.out.println("Error = " + labels[j] + "-" + yhat + "=" + error);
				for(int k = 0; k < weights.length; k++) {
					weights[k] += learningRate * error * trainingInputs[j][k];
				}
				bias += learningRate * error;
				System.out.println("Updated Weights: " + Arrays.toString(weights));
				System.out.println("Updated Bias: " + bias);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] inputMatrix = new int[4][2];
		inputMatrix[0] = new int[]{1,1};
		inputMatrix[1] = new int[]{1,0};
		inputMatrix[2] = new int[]{0,1};
		inputMatrix[3] = new int[]{0,0};
		int[] labels;
		
		//And Gate
		labels = new int[]{1, 0, 0, 0};
		
		//Or Gate
		//labels = new int[]{1, 1, 1, 0};
		
		//Nand Gate
		//labels = new int[]{0, 1, 1, 1};
		
		//Xor Gate
		labels = new int[]{1, 0, 0, 1};
		
		Perceptron p = new Perceptron(2, 10, 1);
		p.train(inputMatrix, labels);
		
		int a = 1;
		int b = 1;
		int[] inputs = {a, b};
		System.out.println("-----Inputs----- " + Arrays.toString(inputs));
		int output = p.predict(inputs);
		System.out.println("-----Outputs-----" + output);
	}
}
