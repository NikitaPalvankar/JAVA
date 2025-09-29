//WAP TO ACCEPT COMMAND LINE ARG.
class CommandLine{
	public static void main(String args[]){
		System.out.println("No. of arguments are "+ args.length);
		for(int i=0; i<args.length;i++){
			System.out.println("HELLO:" + args[i]);
		}
	}
}