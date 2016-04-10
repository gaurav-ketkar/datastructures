
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class MDS {

	class PriceCompare implements Comparator<Item> {
		public int compare(Item item1, Item item2) {
			if (item1.price < item2.price)
				return -1;
			else if (item1.price > item2.price)
				return 1;
			else
				return 0;
		}
	}

	TreeMap<Long, Item> primary = new TreeMap<Long, Item>();
	TreeMap<Long, TreeSet<Item>> secondary = new TreeMap<Long, TreeSet<Item>>();

	int insert(long id, double price, long[] description, int size) {
		// Description of item is in description[0..size-1].
		// Copy them into your data structure.
		return 0;
	}

	double find(long id) {
		return 0;
	}

	long delete(long id) {
		return 0;
	}

	double findMinPrice(long des) {
		TreeSet<Item> temp = secondary.get(des);
		return (temp.first().price);
	}

	double findMaxPrice(long des) {
		TreeSet<Item> temp = secondary.get(des);
		return (temp.last().price);
	}

	int findPriceRange(long des, double lowPrice, double highPrice) {
		TreeSet<Item> temp = secondary.get(des);
		Iterator iter = temp.iterator();
		Item tempitem = null;
		int count = 0;
		while (iter.hasNext()) {
			tempitem = (Item) iter.next();
			if (tempitem.price > lowPrice && tempitem.price < highPrice)
				count++;
		}
		return count;
	}

	double priceHike(long minid, long maxid, double rate) {
		return 0;
	}

	int range(double lowPrice, double highPrice) {
		return 0;
	}

	int samesame() {
		return 0;
	}
}