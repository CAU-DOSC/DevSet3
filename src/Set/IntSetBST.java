package Set;

public class IntSetBST implements IntSet {
	
	int[] array_result;
	public BSTNode root;
	public int maxval;
	public int maxelems;
	public int search_count;
	public int size;
	
	public class BSTNode {
		BSTNode left, right;
		int element;
		//������
		public BSTNode() {
			element = 0;
			left = null;
			right = null;
		}
		
		public BSTNode(int data) {
			element = data;
			left = null;
			right = null;
		}
	};

	
	@Override
	public void intSetImp(int maxelems, int maxval) {
		//�ʱ���� ����
		this.root = null;
		this.maxval = maxval;
		this.maxelems = maxelems;
		this.search_count = 0;
		this.array_result = new int[this.maxelems];
		this.size = 0;
	}
	
	@Override
	public void insert(int element) {
		if(element > maxval || size >= maxelems) {
			return;
		}
		
		BSTNode newBSTNode = new BSTNode(element);
		
		//�ʱ� root ���� 
		if (this.root == null) {
			this.root = newBSTNode;
			this.size++;
			return;
		}
		
		BSTNode nowElement = root; //���� element
		BSTNode pre_nowElement = null; //�ٷ� �� element
		
		while (true) {
			pre_nowElement = nowElement;
			if (element < nowElement.element) { //���Ե� element�� ���� element ���� ���� ���
				nowElement = nowElement.left;
				if (nowElement == null) {
					pre_nowElement.left = newBSTNode;
					this.size++;
					return;
				}
			} 
			else if (element > nowElement.element){	//���Ե� element�� ���� element ���� Ŭ ��� 	
				nowElement = nowElement.right;
				if (nowElement==null) {
					pre_nowElement.right = newBSTNode;
					this.size++;
					return;
				}
			}
			else { //���Ե� element�� ���� element�� ���� ���
				return;
			}
		}
	}

	@Override
	public int size() {
		if (root == null) //root = null �϶�  0�� return �Ѵ�.
			return 0;	
		return this.size;
	}
	
	public void inorder(BSTNode node) {
		if(node == null)
			return;
		inorder(node.left);
		array_result[this.search_count] = node.element;
		this.search_count++;
		inorder(node.right);
	}
	
	@Override
	public int[] report() { //������ element���� report
		inorder(this.root);
		return this.array_result;
	}
}