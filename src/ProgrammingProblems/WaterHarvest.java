
package practiceJava;

public class WaterHarvest {
	public static void main(String[] args) {
		WaterHarvest waterHarvest = new WaterHarvest();
		System.out.println(waterHarvest.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
	}

	public int trap(int[] height) {
		int maxHeight = getMaxHeight(height);
		if (maxHeight == 0) {
			return 0;
		}

		int[] waterHeight = new int[height.length];

		for (int i = 0; i < height.length; i++) {
			int h = height[i];
			if (waterHeight[i] < h) {
				int leftBoundary = getLeftBoundary(height, i, h);
				int rightBoundary = getRightBoundary(height, i, h);
				int filledHeight = Math.min(height[leftBoundary], height[rightBoundary]);
				if (!(leftBoundary == i && rightBoundary == i)) {
					for (int fillIndex = leftBoundary + 1; fillIndex < rightBoundary; fillIndex++) {
						if (waterHeight[fillIndex] < filledHeight) {
							waterHeight[fillIndex] = filledHeight;
						}
							
					}
				}
			}
		}
		int countWaterVol = 0;
		for (int i = 0; i < height.length; i++) {
			int waterVol = waterHeight[i] - height[i];
			if (waterVol > 0)
				countWaterVol += waterVol;
		}
		return countWaterVol;

	}

	public int getMaxHeight(int[] height) {
		int maxHeight = 0;
		if (height.length == 0) {
			return maxHeight;
		}
		for (int i = 0; i < height.length; i++) {
			if (height[i] > maxHeight) {
				maxHeight = height[i];
			}
		}
		return maxHeight;
	}

	public int getLeftBoundary(int[] height, int i, int h) {
		int leftBoundary = i;
		for (int left = i - 1; left >= 0; left--) {
			if (height[left] >= h) {
				leftBoundary = left;
				break;
			}
		}
		return leftBoundary;
	}

	public int getRightBoundary(int[] height, int i, int h) {
		int rightBoundary = i;
		for (int right = i + 1; right < height.length; right++) {
			if (height[right] >= h) {
				rightBoundary = right;
				break;
			}
		}
		return rightBoundary;
	}

}
