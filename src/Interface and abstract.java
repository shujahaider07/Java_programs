interface room {

    public void bed();
}
interface chair{
  public void chairs();
}

abstract class grades{
    public abstract void gpa();
    public abstract void fail();


}


class sagheer extends grades implements room , chair {


    @Override
    public void gpa() {
        System.out.println("4.0");
    }


    @Override
    public void fail() {
        System.out.println("3 courses");
    }

    @Override
    public void bed() {
        System.out.println("3 bed");
    }

    @Override
    public void chairs() {
        System.out.println("87 chairs" );
    }
}
class interfaceandabstract extends  grades  {

    public static void main(String[] args) {

        interfaceandabstract w1 = new interfaceandabstract();
      w1.gpa();
      w1.fail();
      sagheer s1 = new sagheer();
      s1.fail();
      s1.gpa();

    }


    @Override
    public void gpa() {
        System.out.println(3.8);
    }

    @Override
    public void fail() {
        System.out.println("4 courses");
    }
}


