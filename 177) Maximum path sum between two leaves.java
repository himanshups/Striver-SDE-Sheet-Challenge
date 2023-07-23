#include <bits/stdc++.h> 
/************************************************************

    Following is the Tree node structure
	
	template <typename T>
    class TreeNode 
    {
        public : 
        T val;
        TreeNode<T> *left;
        TreeNode<T> *right;

        TreeNode(T val) 
        {
            this -> val = val;
            left = NULL;
            right = NULL;
        }
    };

************************************************************/
pair<int,int> solve(TreeNode<int> *root,pair<int,int> &ans){
    if(root == NULL){
        pair<int,int> p = make_pair(0,0);
        return p;
    }
    pair<int,int> leftans = solve(root->left,ans);
    pair<int,int> rightans = solve(root->right,ans);
    ans.first = max(leftans.first,rightans.first);
    int newsum = ans.first;
    if(newsum == leftans.first){
        newsum = newsum + rightans.first+root->val;
    }
    else newsum = newsum + leftans.first+root->val;
    ans.first = ans.first + root->val; 
    if(newsum >= ans.second){
        ans.second = newsum;
    }
    return ans;
}
long long int findMaxSumPath(TreeNode<int> *root)
{
    if(root == NULL) return -1;
   
    if(root ->left == NULL || root ->right == NULL) return -1;
   
    pair<int,int> ans;
    pair<int,int> temp = solve(root,ans);
    return temp.second;
}