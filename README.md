# Java Loop Bug: Unexpected `continue` Behavior

This repository demonstrates a subtle bug related to the use of the `continue` keyword in a Java `while` loop.  The `BuggyLoop.java` file contains code that exhibits unexpected behavior due to the improper use of `continue`. The `FixedLoop.java` file provides the corrected version.

The bug arises from the combination of `continue` and the incrementing of the loop counter within the loop. The `continue` statement prematurely ends the current iteration, but the loop counter still increments. This leads to an output that differs from what an unsuspecting programmer might anticipate. The solution shows how to fix the problem for expected output.