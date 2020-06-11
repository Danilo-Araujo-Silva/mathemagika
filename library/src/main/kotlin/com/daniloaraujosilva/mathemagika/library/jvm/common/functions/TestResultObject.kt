package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TestResultObject
 *
 * Full name:        System`TestResultObject
 *
 * Usage:            TestResultObject[…] gives an object that represents the results of a VerificationTest.
 *
 * Options:          None
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TestResultObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/TestResultObject.html
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
fun testResultObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TestResultObject", arguments.toMutableList(), options)
}
