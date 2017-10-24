class Sweet extends Junk {

  protected String myflavor;

  public Sweet(String name, int calories, String ethnicity, String flavor){
    super(name, calories, ethnicity);
    myflavor = flavor;
  }


  public void sayEthnicity(){
    System.out.println(getEthnicity()+" from sweet");
  }

  public String getFlavor(){
    return myflavor;
  }

  public void talk(){
    System.out.println("That "+getFlavor()+" flavored "+getName()+" is from "+getEthnicity()+" and has "+getCalories()+" calories. From the sweet class");
  }

}
