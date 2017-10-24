class Legume extends Health {

  protected String myadjective;

  public Legume(String name, int calories, String ethnicity, String adjective){
    super(name,calories, ethnicity);
    myadjective = adjective;
  }

  public String getAdjective(){
    return myadjective;
  }

  public void sayEthnicity(){
    System.out.println(getEthnicity()+" from health");
  }

  public void talk(){
    System.out.println(getName()+" is a "+getAdjective()+" legume from "+getEthnicity()+" and has "+getCalories()+" calories.");
  }


}
