

public class Main {

    // Generator takes 3 command line arguments:
    //    Generator <num_dims> <length> <op_mode>
    //    num_dims = number of dimensions to generate snakes on
    //    length = given length of snakes to generate
    //    If op_mode = 0, output to terminal,
    //       op_mode = 1, output to file
    public static void main (String[] args) {
	int argc = args.length;
	if (argc != 3) {
	    System.out.println("Error, invalid arguments.");
	}
	else {
	    int num_dims = Integer.valueOf(args[0]);
	    int length = Integer.valueOf(args[1]);
	    int op_mode = Integer.valueOf(args[2]);
	    
	    MaxSnakeGen generator = new MaxSnakeGen(num_dims, length);
	    generator.generate_max_snakes();

	    if (op_mode == 0) {
		System.out.println("Snakes: ");
		generator.terminal_output_snakes();
	    }
	    else if (op_mode == 1) {
		generator.file_output_snakes();
	    }
	    else
		System.out.println("Error, invalid output code.");
	}
    }
}
