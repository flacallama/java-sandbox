class Food {

    protected String myname;
    protected int mycalories;
    protected String myethnicity;

    public Food(String name, int calories, String ethnicity){

      myname = name;
      mycalories = calories;
      myethnicity = ethnicity;
    }




    public String getName(){
      return myname;
    }

    public String getEthnicity(){
      return myethnicity;
    }

    public int getCalories(){
      return mycalories;
    }

    public void setWeight(){
      System.out.println("calories"+getCalories());
      mycalories = getCalories()/ 9;
    }


    public void sayEthnicity(){
      System.out.println(getEthnicity()+" from food");
    }

    public void talk(){
      System.out.println(getName()+" is from "+getEthnicity()+" and has "+getCalories()+" calories.");
    }
    // public int setWeight



}
