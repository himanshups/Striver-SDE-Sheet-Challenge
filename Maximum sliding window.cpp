#include <bits/stdc++.h> 
vector<int> slidingWindowMaximum(vector<int> &nums, int &k)
{
    //    Write your code here.
    vector<int> ans;
      deque<int> dq;
        int i = 0, j = 0;

          while (j < nums.size()) {
              while (!dq.empty() and nums[dq.back()] < nums[j])
                    dq.pop_back();

                        dq.push_back(j);

                            if (j - i + 1 < k)
                                  j++;

                                      else if (j - i + 1 == k) {
                                            ans.push_back(nums[dq.front()]);

                                                  if (nums[i] == nums[dq.front()])
                                                          dq.pop_front();

                                                                i++, j++;
                                                                    }
                                                                      }

                                                                        return ans;
}
