package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DynamicWrapper
 *
 * Full name:        System`DynamicWrapper
 *
 * Usage:            DynamicWrapper[e, expr] represents an object that displays as e, but dynamically updates the expression expr whenever that object is visible on screen.
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaseStyle -> {}
 *                   CachedValue :> Null
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> {}
 *                   Deinitialization :> None
 *                   DestroyAfterEvaluation -> False
 *                   DisplayFunction :> Identity
 *                   Enabled -> Automatic
 *                   Evaluator -> Automatic
 *                   ImageSizeCache -> Automatic
 *                   Initialization :> None
 *                   BoxForm`RecursionLimit -> 256
 *                   Selectable -> Automatic
 *                   ShrinkingDelay -> 0.
 *                   SingleEvaluation -> False
 *                   SynchronousUpdating -> True
 *                   TrackedSymbols -> All
 * Options:          UpdateInterval -> Infinity
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DynamicWrapper
 * Documentation:    web: http://reference.wolfram.com/language/ref/DynamicWrapper.html
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
fun dynamicWrapper(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicWrapper", arguments.toMutableList(), options)
}
