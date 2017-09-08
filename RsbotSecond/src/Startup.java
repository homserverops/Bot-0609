import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;

import java.awt.*;

@ScriptManifest(name = "FischingMetSwag", author = "Wouwter", version = 1.0, info = "This will fish", logo = "")

public class Startup extends Script {

    @Override
    public void onStart() {
        log("welgekomen FELLOW HAckEr");

    }

    @Override
    public void onExit() {
        log("Toodles");

    }

    @Override
    public int onLoop() throws InterruptedException {
        return 0;
    }


}