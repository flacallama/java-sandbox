/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
      // System.out.println("java up and running");


      Junk tootsieroll = new Junk("Tootsieroll", 200, "Murica");
      // tootsieroll.getEthnicity();
      tootsieroll.talk();
      tootsieroll.sayEthnicity();
      tootsieroll.setWeight();

      Sweet cake = new Sweet("Cake", 600, "France", "chocolate");
      cake.talk();
      // cake.getEthnicity();
      cake.sayEthnicity();
      cake.setWeight();

      Health potato = new Health("Potato", 30, "Peru");
      potato.talk();
      potato.setWeight();

      Legume quinoa = new Legume("Quinoa", 100, "Ecuador", "not unpleasant");
      quinoa.talk();
    }

}
