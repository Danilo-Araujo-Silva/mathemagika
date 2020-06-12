package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TestReport
 *
 * Full name:        System`TestReport
 *
 *                   TestReport[{test , test , …}] gives a report of the results of the verification tests test .
 *                                   1      2                                                                  i
 * Usage:            TestReport["file"] runs tests from a file, returning an analysis of the completed test run.
 *
 *                   MemoryConstraint -> Infinity
 *                   SameTest -> SameQ
 * Options:          TimeConstraint -> Infinity
 *
 *                   HoldFirst
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TestReport
 * Documentation:    web: http://reference.wolfram.com/language/ref/TestReport.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun testReport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TestReport", arguments.toMutableList(), options)
}
