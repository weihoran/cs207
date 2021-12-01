package command;

// a generic balloon command
public interface BalloonCommand {
	
	public abstract void execute();
	
	// execute can also take an argument, e.g., execute(args)
}
