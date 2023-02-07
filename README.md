# Background of random colored dots in different colors using Java
Just play and practice the computer graphic test :)

## Code
#### 1. To create random coordinates and draw them as colored dots on the screen
           
##
            for (int i = 1; i <= 9000; i++) { 
            int x=(int)(Math.random()*(500));
            int y=(int)(Math.random()*(500));
            g.setColor(RandomColor());
            g.drawLine(x, y, x, y);
        }


#### 2. To create neat coordinates and draw them as colored dots on the screen
##
            for (int i = 1; i <= 500; i+=3) {
            for (int j = 0; j < 500; j+=3) {
            g.setColor(RandomColor());
            g.drawLine(i, j, i, j);            
        }
        }

#### 3. A method to create random colors
##
        public Color RandomColor(){
        Random r = new Random();
        int red=r.nextInt(255);
        int green=r.nextInt(255);
        int blue=r.nextInt(255);
        return new Color(red,green,blue);
    }


