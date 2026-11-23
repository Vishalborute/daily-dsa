import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {

    private List<Integer> prefixProduct;

    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // base value
    }

    public void add(int num) {
        if (num == 0) {
            // Any product including this zero becomes 0
            prefixProduct.clear();
            prefixProduct.add(1);
        } else {
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProduct.size();

        // A zero was added within the last k numbers
        if (k >= size) {
            return 0;
        }

        int totalProduct = prefixProduct.get(size - 1);
        int beforeKProduct = prefixProduct.get(size - 1 - k);

        return totalProduct / beforeKProduct;
    }
}