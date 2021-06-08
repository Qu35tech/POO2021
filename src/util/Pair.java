package util;

public class Pair<F,S> {

    public F first;
    public S second;

    public Pair(F first, S second) {
        assert first != null;
        assert second != null;

        this.first = first;
        this.second = second;
    }

    public F getFirst() { return first; }
    public S getSecond() { return second; }

    public void setFirst(F first) { this.first = first; }
    public void setSecond(S second) { this.second = second; }

    @Override
    public int hashCode() { return first.hashCode() ^ second.hashCode(); }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) return false;
        Pair pairo = (Pair) o;
        return this.first.equals(pairo.getFirst()) &&
                this.second.equals(pairo.getSecond());
    }

}