package Part1;

    public class Wall implements Obtacle {
        private final int height;

        public Wall(int height) {
            this.height = height;
        }

        @Override
        public int getLength() {
            return 0;
        }

        @Override
        public int getHeight() {
            return height;
        }
    }

