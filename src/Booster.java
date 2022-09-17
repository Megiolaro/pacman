public class Booster extends Item {
    private int turno = 10;
   
    public Booster(int x, int y) {
        super(x, y,100); //FIXME: Mudar tamanhoTela

        this.turno = 10; //FIXME: Definir turno
        
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    

}