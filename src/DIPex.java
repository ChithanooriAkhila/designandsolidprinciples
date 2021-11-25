/*
DIP:
Dependency inversion principle.
High module depend on low moduless.
Dependency inversion principle higher level models and lower level models are basically separated with thin line of abstraction.
this abstraction can be achieved using interfaces.
higher level module implements the interface.
and the lower level models are basically operator using this interface.
so there will be a thin line of abstraction in which high level models and low level models are separated.
and they will be independent of each other and their no longer be attached to one another.
 */
interface ILogger{
    public void logInformation(String info);
}
class Logger implements ILogger{
    public void logInformation(String info){
        System.out.println(info);
    }
}
class LoggingToFile{
    ILogger logger;
    public LoggingToFile(ILogger logger){
        this.logger=logger;
    }
    public void logging(){
        logger.logInformation("Logging to the file...");
    }
}
class LoggingToDb{
    ILogger logger;
    public LoggingToDb(ILogger logger){
        this.logger=logger;
    }
    public void logging(){
        logger.logInformation("saving to the database...");
    }
}
public class DIPex {
    public static void main(String[] args) {
    LoggingToFile obj=new LoggingToFile(new Logger());
    obj.logging();
    LoggingToDb obj1=new LoggingToDb(new Logger());
    obj1.logging();
    }
}
