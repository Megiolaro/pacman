public class GameObject {

    private int posicaoX;
    private int posicaoY;
    private int tamanhoTela;

    public GameObject(int posicaoX, int posicaoY, int tamanhoTela) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.tamanhoTela = tamanhoTela;
    }

    public int getX() {
        return posicaoX;
    }

    public void setX(int posicaoX) {
        if (posicaoX<0) {
            System.out.println("Posicao Invalida");
            this.posicaoX = 0;
        }
        else
        this.posicaoX = posicaoX;
    }

    public int getY() {
        return posicaoY;
    }

    public void setY(int posicaoY) {
        if (posicaoY<0) {
            System.out.println("Posicao Invalida");
            this.posicaoY = 0;
        }
        else
        this.posicaoY = posicaoY;
        
    }

    public int getScreenSize() {
        return tamanhoTela;
    }

    public void setScreenSize(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public GameObject(int posicaoX, int posicaoY){
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;

    }

    public boolean colisao(GameObject obj){
        if(getX() >= obj.getX() && getX() <= obj.getX() + obj.getScreenSize() && getY() >= obj.getY() && getY() <= obj.getY() + obj.getScreenSize()){
            return true;
        }
        return false;
    }


}
