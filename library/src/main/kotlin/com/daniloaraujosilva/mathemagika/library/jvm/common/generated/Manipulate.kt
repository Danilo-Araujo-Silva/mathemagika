package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Manipulate
 * 
 * Full name:        System`Manipulate
 * 
 *                   Manipulate[expr, {u, u   , u   }] generates a version of expr with controls added to allow interactive manipulation of the value of u. 
 *                                         min   max
 *                   Manipulate[expr, {u, u   , u   , du}] allows the value of u to vary between u    and u    in steps du. 
 *                                         min   max                                              min      max
 *                   Manipulate[expr, {{u, u    }, u   , u   , …}] takes the initial value of u to be u    . 
 *                                          init    min   max                                          init
 *                   Manipulate[expr, {{u, u    , u   }, …}] labels the controls for u with u   . 
 *                                          init   lbl                                       lbl
 *                   Manipulate[expr, {u, {u , u , …}}] allows u to take on discrete values u , u , …. 
 *                                          1   2                                            1   2
 *                   Manipulate[expr, {u, …}, {v, …}, …] provides controls to manipulate each of the u, v, …. 
 *                   Manipulate[expr, c   {u, …}, c   {v, …}, …] links the controls to the specified controllers on an external device.
 * Usage:                              u            v
 * 
 *                   Alignment -> Automatic
 *                   AppearanceElements -> Automatic
 *                   AutoAction -> False
 *                   AutorunSequencing -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Bookmarks -> {}
 *                   ContentSize -> Automatic
 *                   ContinuousAction -> Automatic
 *                   ControlAlignment -> Automatic
 *                   ControllerLinking -> Automatic
 *                   ControllerMethod -> None
 *                   ControllerPath -> Automatic
 *                   ControlPlacement -> Automatic
 *                   ControlType -> Automatic
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
 *                   Paneled -> True
 *                   PreserveImageOptions -> True
 *                   RotateLabel -> False
 *                   SaveDefinitions -> False
 *                   ShrinkingDelay -> 0
 *                   SynchronousInitialization -> True
 *                   SynchronousUpdating -> Automatic
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
 *                   local: paclet:ref/Manipulate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Manipulate.html
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
fun manipulate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Manipulate", arguments.toMutableList(), options)
}
