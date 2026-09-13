abstract class Storage { abstract void save(); }
class LocalStorage extends Storage { void save() { System.out.println("Saving to local storage"); } }
class CloudStorage extends Storage { void save() { System.out.println("Saving to cloud"); } }
class DatabaseStorage extends Storage { void save() { System.out.println("Saving to database"); } }
public class FileStorage { public static void main(String[] args) { Storage s = new LocalStorage(); s.save(); s = new CloudStorage(); s.save(); s = new DatabaseStorage(); s.save(); } }
