package iterator;

/**
 * Created by daniel on 30/11/16.
 */
public class JavaDeveloper implements Collection {
    String name;
    String[] skils;

    public JavaDeveloper(String name, String[] skils) {
        this.name = name;
        this.skils = skils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkils() {
        return skils;
    }

    public void setSkils(String[] skils) {
        this.skils = skils;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }
    private class SkillIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
           if(index<skils.length) {
               return true;
           }
           return false;
        }

        @Override
        public Object next() {
            return skils[index++];
        }
    }
}
