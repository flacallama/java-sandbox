class Junk extends Food {

    // private String myname;
    // private int mycalories;
    // private String myethnicity;

    public Junk(String name, int calories, String ethnicity){
      super(name,calories, ethnicity);
    }



    public void sayEthnicity(){
      System.out.println(getEthnicity()+" from junk");
    }

    public void talk(){
      System.out.println(getName()+" is from "+getEthnicity()+" and has "+getCalories()+" calories. From the junk class");
    }
    // public int setWeight



}
