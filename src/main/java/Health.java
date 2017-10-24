class Health extends Food {

  public Health(String name, int calories, String ethnicity){
    super(name,calories, ethnicity);
  }



  public void sayEthnicity(){
    System.out.println(getEthnicity()+" from health");
  }

  public void talk(){
    System.out.println(getName()+" is from "+getEthnicity()+" and has "+getCalories()+" calories. From the health class");
  }
  // public int setWeight




}
