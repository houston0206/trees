Lab: Trees (3/23/2026)

Authors:
El Houston
Risa Takemoto

## Build commands

*   Compilation and execution: `mvn compile exec:java`.
*   Compilation and testing: `mvn compile test`.
*   Check style: `mvn checkstyle:checkstyle`.

## Resources

*   Hierarchies reading: https://osera.cs.grinnell.edu/ttap/data-structures/hierarchical-structures.html 
*   Lab manual: https://osera.cs.grinnell.edu/ttap/data-structures-labs/trees.html 

## Write-up

Part 1: Contains
If the node is empty, then the value is not in the tree. Return false. If the value at the node
equals the search value, then return true. If neither of these cases are true, evaluate the contains
algorithm for both the left and right subtrees, and return true if either one is true.

Part 2: Traversals
In-order Traversal: If the node is empty, return to the previous node. Otherwise, go into the left subtree. After
reaching a null leaf, add the value at the previous node to a list, and then go into the right subtree and repeat
the process. It will continue recursively until all values in the tree have been added to the list.
Preorder Traversal: If the node is empty, return to the previous node. At the start of every new subtree, add 
the value at the node to a list. Repeat this process for the left subtree until reaching null, and then do
the same for the right subtree.
Postorder Traversal: Same as the preorder traversal, except the value at the node is only added to the list
after both left and right subtrees have been evaluated and all their values added to the list.
