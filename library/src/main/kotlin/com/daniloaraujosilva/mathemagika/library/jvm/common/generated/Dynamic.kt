package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Dynamic
 * 
 * Full name:        System`Dynamic
 * 
 *                   Dynamic[expr] represents an object that displays as the dynamically updated current value of expr. If the displayed form of Dynamic[expr] is interactively changed or edited, an assignment expr = val is done to give expr the new value val that corresponds to the displayed form. 
 *                   Dynamic[expr, None] does not allow interactive changing or editing. 
 *                   Dynamic[expr, f] continually evaluates f[val, expr] during interactive changing or editing of val. 
 *                   Dynamic[expr, {f, f   }] also evaluates f   [val, expr] when interactive changing or editing is complete. 
 *                                      end                   end
 *                   Dynamic[expr, {f     , f, f   }] also evaluates f     [val, expr] when interactive changing or editing begins. 
 * Usage:                            start      end                   start
 * 
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaseStyle -> {}
 *                   CachedValue :> Null
 *                   ContentPadding -> True
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
 *                   SaveDefinitions -> False
 *                   Selectable -> Automatic
 *                   ShrinkingDelay -> 0.
 *                   SingleEvaluation -> False
 *                   SynchronousUpdating -> True
 *                   TrackedSymbols -> All
 * Options:          UpdateInterval -> Infinity
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Dynamic
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dynamic.html
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
fun `dynamic`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dynamic", arguments.toMutableList(), options)
}
