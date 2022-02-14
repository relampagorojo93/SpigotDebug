package relampagorojo93.LibsCollection.SpigotDebug.Data;

import relampagorojo93.LibsCollection.SpigotDebug.DebugData;
import relampagorojo93.LibsCollection.SpigotDebug.DebugType;

public class DebugErrorData extends DebugData {
	
	public DebugErrorData(String message) {
		super(DebugType.ERROR, message);
	}
	
}
