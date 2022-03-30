/**
 * <h1>Gestione della classe Time</h1>
 * @author Guido Lanzi
 */

public class Time {
    /**
     * Numero di ore dell'oggetto time
     */
    protected int ore;
    /**
     * Numero di minuti dell'oggetto time
     */
    protected int minuti;
    /**
     * Numero di secondi dell'oggetto time
     */
    protected int secondi;

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * @param secondi
     */
    public Time(int secondi) {

    }

    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * @param ore ore da
     * @param minuti
     * @param secondi
     */
    public Time(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    /**
     * Restituisce il numero di ore
     * @return in 
     */
    public int getOre() {
        return this.ore;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    /**
     * Restituisce il numero di minuti
     * @return
     */
    public int getMinuti() {
        return this.minuti;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * Restituisce il numero di secondi
     * @return
     */
    public int getSecondi() {
        return this.secondi;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    /**
     * Vengono addizionati il numero di secondi specificati.
     * @param secondi da aggiungere
     */
    public void addSecondi(int secondi) {
        this.secondi += secondi;
    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi. Esempio: 1 ora, 20 min, 10 secondi -> 4810s
     * @return
     */
    public int convertiSecondi() {
        return this.ore*3600 + this.minuti*60 + this.secondi;
    }

    public String convertiOre(int secondi)
    {
        int ore = secondi/3600;
        int minuti = secondi/60 - 60;
        int sec = secondi - (minuti*60+60);
        return "ore" + ore + "minuti" + minuti + "secondi" + sec; 
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     */
    @Override
    public String toString() {
        return this.ore + ":" + this.minuti + ":" +secondi;
    }
}

    
