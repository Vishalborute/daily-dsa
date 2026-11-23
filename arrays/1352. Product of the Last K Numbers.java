import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {

    private final List<Integer> prefixProduct;

    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Base value makes product division possible.
    }

    public void add(int num) {
        if (num == 0) {
            // Products cannot cross a zero, so start a new prefix-product list.
            prefixProduct.clear();
            prefixProduct.add(1);
            return;
        }

        int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
        prefixProduct.add(lastProduct * num);
    }

    public int getProduct(int k) {
        int size = prefixProduct.size();

        // Fewer than k values after the latest zero means the answer includes zero.
        if (k >= size) {
            return 0;
        }

        int totalProduct = prefixProduct.get(size - 1);
        int beforeKProduct = prefixProduct.get(size - 1 - k);
        return totalProduct / beforeKProduct;
    }
}
