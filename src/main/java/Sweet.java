class Sweet extends Junk {


  public Sweet(String name, int calories, String ethnicity){
    super(name, calories, ethnicity);
  }


  public void sayEthnicity(){
    System.out.println(getEthnicity()+" from sweet");
  }

  public void talk(){
    System.out.println(getName()+" is from "+getEthnicity()+" and has "+getCalories()+" calories. From the sweet class");
  }

}
