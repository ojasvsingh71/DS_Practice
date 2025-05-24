#include<iostream>
using namespace std;

struct TreeNode{
    int val;
    struct TreeNode* left;
    struct TreeNode* right;

    TreeNode():val(0),left(nullptr),right(nullptr){}
    TreeNode(int x):val(x),left(nullptr),right(nullptr){}
    TreeNode(int x,TreeNode* lefti,TreeNode* righti):val(x),left(lefti),right(righti){}
};

TreeNode* add(TreeNode* root,int x){
    if(!root){
        return new TreeNode(x);
    }else if(x>root->val){
        root->right=add(root->right,x);
    }else if(x<root->val){
        root->left=add(root->left,x);
    }else{
        cout<<"Duplicate elements not allowed\n";
    }return root;
}

void inorder(TreeNode* root){
    if(root){
        inorder(root->left);
        cout<<root->val<<" ";
        inorder(root->right);
    }
}

int main(){
    int num;
    TreeNode* bu=NULL;

    cin>>num;
    while(num--){
        int data;
        cin>>data;
        bu=add(bu,data);
    }

    inorder(bu);

    return 0;
}