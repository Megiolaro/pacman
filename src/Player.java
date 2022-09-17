public class Player extends GameObject
{
    private int quantVidas;
    private int direcao;
    private boolean invencivel;

    public Player(int posicaoX, int posicaoY, int tamanhoTela) {
        super(posicaoX, posicaoY, tamanhoTela);
    }

    public int getLife() {
        return quantVidas;
    }

    public void setLife(int quantVidas) {
        if (quantVidas<1) {
            System.out.println("Quantidade de vidas precisa ser maior que zero");
        }
        else
        this.quantVidas = quantVidas;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirection(int direcao) {
        if (direcao<0) {
            System.out.println("direcao Invalida");
        }
        
        this.direcao = direcao;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }

    public Player(int posicaoX, int posicaoY, int tamanhoTela, int quantVidas, int direcao, boolean invencivel) {
        super(posicaoX, posicaoY, tamanhoTela);
        this.quantVidas = quantVidas;
        this.direcao = direcao;
        this.invencivel = invencivel;
    }
    

    public boolean mover(){

    int x=getX(), y=getY();

        if(direcao == 0){
           y -= 10;
        }
        if(direcao == 180){
            y += 10;
        }
        if(direcao == 90){
            x += 10;
        }
        if(direcao == 270){
            x -= 10;
        }

        if(x < getScreenSize() && x > 0){
            if(y < getScreenSize() && y > 0){
                //TODO: Mover o jogador caso verdadeiro
                setX(x);
                setY(y); 
                return true;
            }
        }
       
       return false;

      
            
    }
}
       
