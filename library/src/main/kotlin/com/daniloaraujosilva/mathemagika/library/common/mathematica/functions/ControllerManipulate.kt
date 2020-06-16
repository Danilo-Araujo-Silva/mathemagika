package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ControllerManipulate
 *
 * Full name:        System`ControllerManipulate
 *
 *                   ControllerManipulate[expr, {u, u   , u   }] generates a version of expr set up to allow interactive manipulation of the value of u using an external controller device.
 *                                                   min   max
 *                   ControllerManipulate[expr, {u, u   , u   , du}] allows the value of u to vary between u    and u    in steps du.
 *                                                   min   max                                              min      max
 *                   ControllerManipulate[expr, {{u, u    }, u   , u   , …}] takes the initial value of u to be u    .
 *                                                    init    min   max                                          init
 *                   ControllerManipulate[expr, {u, {u , u , …}}] allows u to take on discrete values u , u , ….
 *                                                    1   2                                            1   2
 *                   ControllerManipulate[expr, {u, …}, {v, …}, …] allows each of the u, v, … to be manipulated by the external controller device.
 *                   ControllerManipulate[expr, c   {u, …}, c   {v, …}, …] links the parameters to the specified controllers on the external controller device.
 * Usage:                                        u            v
 *
 *                   Alignment -> Automatic
 *                   AppearanceElements -> None
 *                   AutoAction -> False
 *                   AutorunSequencing -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Bookmarks -> {}
 *                   ContentSize -> Automatic
 *                   ContinuousAction -> Automatic
 *                   ControlAlignment -> Automatic
 *                   ControllerLinking -> Automatic
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   ControlPlacement -> Automatic
 *                   ControlType -> None
 *                   DefaultBaseStyle -> Manipulate
 *                   DefaultLabelStyle -> ManipulateLabel
 *                   Deinitialization :> None
 *                   Deployed -> False
 *                   Evaluator -> Automatic
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   Initialization :> None
 *                   InterpolationOrder -> Automatic
 *                   LabelStyle -> {}
 *                   LocalizeVariables -> True
 *                   Method -> {}
 *                   Paneled -> False
 *                   PreserveImageOptions -> True
 *                   RotateLabel -> False
 *                   SaveDefinitions -> False
 *                   ShrinkingDelay -> 0
 *                   SynchronousInitialization -> True
 *                   SynchronousUpdating -> True
 *                   TouchscreenAutoZoom -> False
 *                   TouchscreenControlPlacement -> Automatic
 *                   TrackedSymbols -> Full
 *                   UndoTrackedVariables :> None
 *                   UnsavedVariables :> None
 * Options:          UntrackedVariables :> None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllerManipulate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllerManipulate.html
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
fun controllerManipulate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllerManipulate", arguments.toMutableList(), options)
}
