package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Trigger
 *
 * Full name:        System`Trigger
 *
 *                   Trigger[Dynamic[u]] represents a trigger that can be pressed to make the dynamically updated value of u be continually increased with time from 0 to 1.
 *                   Trigger[Dynamic[u], {u   , u   }] makes u vary from u    to u    when triggered.
 *                                         min   max                      min     max
 *                   Trigger[Dynamic[u], {u   , u   , du}] makes u vary in steps du when triggered.
 *                                         min   max
 *                   Trigger[Dynamic[u], {u   , u   }, ups] makes the value of u increase at a rate of ups units per second when triggered.
 * Usage:                                  min   max
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   AnimationDirection -> Forward
 *                   AnimationRate -> Automatic
 *                   AnimationRepetitions -> 1
 *                   AnimationRunning -> False
 *                   AnimationRunTime -> 0
 *                   AnimationTimeIndex -> Automatic
 *                   Appearance -> Automatic
 *                   AppearanceElements -> {TriggerButton, PauseButton, ResetButton}
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> {}
 *                   DefaultDuration -> 5.
 *                   DisplayAllSteps -> False
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   PausedTime -> 0
 * Options:          RefreshRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Trigger
 * Documentation:    web: http://reference.wolfram.com/language/ref/Trigger.html
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
fun trigger(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Trigger", arguments.toMutableList(), options)
}
