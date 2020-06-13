package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VerificationTest
 *
 * Full name:        System`VerificationTest
 *
 *                   VerificationTest[input] runs a verification test to determine whether input evaluates to True, without issuing messages.
 *                   VerificationTest[input, expected] tests whether input evaluates to expected, without issuing messages.
 * Usage:            VerificationTest[input, expected, messages] tests whether input evaluates to expected, generating the list of message names messages.
 *
 *                   MemoryConstraint -> Infinity
 *                   SameTest -> SameQ
 *                   TestClass -> None
 *                   TestID -> None
 * Options:          TimeConstraint -> Infinity
 *
 *                   HoldAllComplete
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VerificationTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerificationTest.html
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
fun verificationTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerificationTest", arguments.toMutableList(), options)
}
