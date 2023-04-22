public class namepattern {
	

	static int height = 5;

	// Number of character width in each line
	static int width = (2 * height) - 1;

	// Function to print the pattern of 'A'
	static void A() {
		int n = width / 2, i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == n || j == (width - n)
						|| (i == height / 2 && j > n
								&& j < (width - n)))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			
			System.out.printf("\n");
			n--;
		}
		System.out.println("\n\n");
	}

	// Function to print the pattern of 'B'
	static void B() {
		int i, j, half = (height / 2);
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < width; j++) {
				if ((i == 0 || i == height - 1 || i == half)
						&& j < (width - 2))
					System.out.printf("*");
				else if (j == (width - 2)
						&& !(i == 0 || i == height - 1
								|| i == half))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'C'
	static void C() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < (height - 1); j++) {
				if (i == 0 || i == height - 1)
					System.out.printf("*");
				else
					continue;
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'D'
	static void D() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height - 1)
						&& j < height - 1)
					System.out.printf("*");
				else if (j == height - 1 && i != 0
						&& i != height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'E'
	static void E() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height - 1)
						|| (i == height / 2
								&& j <= height / 2))
					System.out.printf("*");
				else
					continue;
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'F'
	static void F() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0) || (i == height / 2
						&& j <= height / 2))
					System.out.printf("*");
				else
					continue;
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'G'
	static void G() {
		int i, j;
		width--;
		for (i = 0; i < height; i++) {
			for (j = 0; j < width; j++) {
				if ((i == 0 || i == height - 1)
						&& (j == 0 || j == width - 1))
					System.out.printf(" ");
				else if (j == 0)
					System.out.printf("*");
				else if (i == 0 && j <= height)
					System.out.printf("*");
				else if (i == height / 2
						&& j > height / 2)
					System.out.printf("*");
				else if (i > height / 2
						&& j == width - 1)
					System.out.printf("*");
				else if (i == height - 1
						&& j < width)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'H'
	static void H() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((j == height - 1)
						|| (i == height / 2))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'I'
	static void I() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if (i == 0 || i == height - 1)
					System.out.printf("*");
				else if (j == height / 2)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'J'
	static void J() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if (i == height - 1 && (j > 0
						&& j < height - 1))
					System.out.printf("*");
				else if ((j == height - 1
						&& i != height - 1)
						|| (i > (height / 2) - 1
								&& j == 0 && i != height - 1))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'K'
	static void K() {
		int i, j, half = height / 2, dummy = half;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j <= half; j++) {
				if (j == abs(dummy))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			dummy--;
		}System.out.println("\n\n");
	}

	private static int abs(int dummy) {
		return 0;
	}

	// Function to print the pattern of 'L'
	static void L() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j <= height; j++) {
				if (i == height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'M'
	static void M() {
		int i, j, counter = 0;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j <= height; j++) {
				if (j == height)
					System.out.printf("*");
				else if (j == counter
						|| j == height - counter - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			if (counter == height / 2) {
				counter = -99999;
			} else
				counter++;
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'N'
	static void N() {
		int i, j, counter = 0;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j <= height; j++) {
				if (j == height)
					System.out.printf("*");
				else if (j == counter)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			counter++;
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'O'
	static void O() {
		int i, j, space = (height / 3);
		int width = height / 2 + height / 5 + space + space;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == width - abs(space)
						|| j == abs(space))
					System.out.printf("*");
				else if ((i == 0
						|| i == height - 1)
						&& j > abs(space)
						&& j < width - abs(space))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			if (space != 0
					&& i < height / 2) {
				space--;
			} else if (i >= (height / 2 + height / 5))
				space--;
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'P'
	static void P() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height / 2)
						&& j < height - 1)
					System.out.printf("*");
				else if (i < height / 2
						&& j == height - 1 && i != 0)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'Q'
	static void Q() {

		int i, j, d = height;
		for (i = 0; i < height / 2; i++) {
			for (j = 0; j <= d; j++) {
				if (j == d)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			d++;
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'R'
	static void R() {
		int i, j, half = (height / 2);
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < width; j++) {
				if ((i == 0 || i == half)
						&& j < (width - 2))
					System.out.printf("*");
				else if (j == (width - 2)
						&& !(i == 0 || i == half))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'S'
	static void S() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height / 2
						|| i == height - 1))
					System.out.printf("*");
				else if (i < height / 2
						&& j == 0)
					System.out.printf("*");
				else if (i > height / 2
						&& j == height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'T'
	static void T() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if (i == 0)
					System.out.printf("*");
				else if (j == height / 2)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'U'
	static void U() {
		int i, j;
		for (i = 0; i < height; i++) {
			if (i != 0 && i != height - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
			for (j = 0; j < height; j++) {
				if (((i == height - 1)
						&& j >= 0
						&& j < height - 1))
					System.out.printf("*");
				else if (j == height - 1 && i != 0
						&& i != height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'V'
	static void V() {
		int i, j, counter = 0;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == counter
						|| j == width - counter - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			counter++;
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'W'
	static void W() {
		int i, j, counter = height / 2;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j <= height; j++) {
				if (j == height)
					System.out.printf("*");
				else if ((i >= height / 2)
						&& (j == counter
								|| j == height - counter - 1))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			if (i >= height / 2) {
				counter++;
			}
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'X'
	static void X() {
		int i, j, counter = 0;
		for (i = 0; i <= height; i++) {
			for (j = 0; j <= height; j++) {
				if (j == counter
						|| j == height - counter)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			counter++;
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'Y'
	static void Y() {
		int i, j, counter = 0;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= height; j++) {
				if (j == counter
						|| j == height - counter
								&& i <= height / 2)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			if (i < height / 2)
				counter++;
		}System.out.println("\n\n");
	}

	// Function to print the pattern of 'Z'
	static void Z() {
		int i, j, counter = height - 1;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if (i == 0 || i == height - 1
						|| j == counter)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			counter--;
			System.out.printf("\n");
		}System.out.println("\n\n");
	}

}
