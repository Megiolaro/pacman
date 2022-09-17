public class Item extends GameObject{

    private boolean visivel;
    
    
    
    public Item(int posicaoX, int posicaoY, int tamanhoTela, boolean visivel) {
        super(posicaoX, posicaoY, tamanhoTela);
        this.visivel = visivel;
    }



    public Item(int posicaoX, int posicaoY, int tamanhoTela) {
        super(posicaoX, posicaoY, tamanhoTela);
        
    }



    public boolean isVisivel() {
        return visivel;
    }



    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }
    
}
