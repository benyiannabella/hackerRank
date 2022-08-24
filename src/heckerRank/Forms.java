package heckerRank;

public abstract class Forms {
    private int height;
    private int width;

    public Forms(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract void createForm(int height, int width);

    public static void main(String[] args) {
        Square s = new Square(5,8);
//        s.createForm(s.getHeight(),s.getWidth());
        Triangle t = new Triangle(3,4);
        t.createForm(t.getHeight(), t.getWidth());
    }
}

class Square extends Forms{
    public Square(int height, int width) {
        super(height,width);
    }

    @Override
    public void createForm(int height, int width) {
        for(int i = 0; i<height; i++){
           for(int j = 0; j<width; j++){
               if(i==0 || i==height-1){
                   System.out.print("-");
               } else {
                   if(j==0 || j==width-1){
                       System.out.print("|");
                   } else {
                       System.out.print(" ");
                   }
               }
           }
            System.out.println();
        }
    }

}

class Triangle extends Forms{
    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void createForm(int height, int width) {
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(i==height-1){
                    System.out.print("-");
                } else {
                    if (j == i-1){
                        System.out.print("/");
                    } else if (j==height-i) {
                        System.out.println("\\");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
        }
    }
}