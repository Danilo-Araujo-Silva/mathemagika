package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Animator
 *
 * Full name:        System`Animator
 *
 *                   Animator[u] represents an object that displays with the value of u being continually increased from 0 to 1 with time.
 *                   Animator[u, {u   , u   }] makes u vary from u    to u   .
 *                                 min   max                      min     max
 *                   Animator[u, {u   , u   , du}] makes u vary in steps du.
 *                                 min   max
 *                   Animator[u, {u   , u   }, ups] makes the value of u increase at a rate of ups units per second.
 * Usage:                          min   max
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   AnimationDirection -> Forward
 *                   AnimationRate -> Automatic
 *                   AnimationRepetitions -> Infinity
 *                   AnimationRunning -> True
 *                   AnimationRunTime -> 0
 *                   AnimationTimeIndex -> Automatic
 *                   Appearance -> Automatic
 *                   AppearanceElements -> {ProgressSlider, StepLeftButton, StepRightButton, PlayPauseButton, FasterSlowerButtons, DirectionButton}
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
 *                   PausedTime -> Automatic
 * Options:          RefreshRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Animator
 * Documentation:    web: http://reference.wolfram.com/language/ref/Animator.html
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
fun animator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Animator", arguments.toMutableList(), options)
}
