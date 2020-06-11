package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Interpretation
 *
 * Full name:        System`Interpretation
 *
 *                   Interpretation[e, expr] represents an object that displays as e, but is interpreted as the unevaluated form of expr if supplied as input.
 *                   Interpretation[{x = x , y = y , …}, e, expr] allows local variables x, y, … in e and expr.
 * Usage:                                 0       0
 *
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> {}
 *                   Deinitialization :> None
 *                   DynamicModuleParent -> None
 *                   DynamicModuleValues -> Automatic
 *                   InheritScope -> False
 *                   Initialization :> None
 *                   SynchronousInitialization -> True
 *                   UndoTrackedVariables :> None
 *                   UnsavedVariables :> None
 * Options:          UntrackedVariables :> None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Interpretation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Interpretation.html
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
fun interpretation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Interpretation", arguments.toMutableList(), options)
}
