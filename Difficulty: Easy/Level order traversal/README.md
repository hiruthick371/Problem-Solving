<h2><a href="https://www.geeksforgeeks.org/problems/level-order-traversal/1">Level order traversal</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a&nbsp;<strong>root</strong>&nbsp;of a binary tree with&nbsp;<strong>n</strong> nodes, the task is to find its level order traversal. </span><span style="font-size: 14pt;">Level order traversal of a tree is&nbsp;<a href="http://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/"><span style="text-decoration: underline; color: #3598db;">breadth-first traversal</span></a>&nbsp;for the tree.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root = [1, 3, 2]
&nbsp;&nbsp;  1
 &nbsp;/&nbsp;&nbsp;&nbsp;\ 
&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp; 2
<strong>Output: </strong>[[1], [3, 2]]
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root = [10, 20, 30, 40, 60]
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 10
 &nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \
 &nbsp;  20&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 30
&nbsp; /&nbsp;&nbsp; \
 40&nbsp;&nbsp; 60
<strong>Output: </strong>[[10], [20, 30], [40, 60]]</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root = [1, 3, 2, N, N, N, 4, 6, 5]
 &nbsp;  1
 &nbsp;/&nbsp;&nbsp;&nbsp;\ 
&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp; 2<br>        \<br>         4<br>        / \<br>       6   5
<strong>Output: </strong>[[1], [3, 2], [4], [6, 5]]</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span></p>
<ul>
<li><span style="font-size: 14pt;">1 ≤ number of nodes ≤ 10<sup>5</sup></span></li>
<li><span style="font-size: 14pt;">0 ≤ node-&gt;data ≤ 10<sup>9</sup></span></li>
</ul></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Morgan Stanley</code>&nbsp;<code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>D-E-Shaw</code>&nbsp;<code>Ola Cabs</code>&nbsp;<code>Payu</code>&nbsp;<code>Adobe</code>&nbsp;<code>Cisco</code>&nbsp;<code>Qualcomm</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;