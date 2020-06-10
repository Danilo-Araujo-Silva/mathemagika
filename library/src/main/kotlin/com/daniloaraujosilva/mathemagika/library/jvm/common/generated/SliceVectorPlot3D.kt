package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SliceVectorPlot3D
 * 
 * Full name:        System`SliceVectorPlot3D
 * 
 *                   SliceVectorPlot3D[{v , v , v }, surf, {x, x   , x   }, {y, y   , y   }, {z, z   , z   }] generates a vector plot of the field {v , v , v } over the slice surface surf. 
 *                                       x   y   z              min   max        min   max        min   max                                          x   y   z
 *                   SliceVectorPlot3D[{v , v , v }, surf, {x, y, z} ∈ reg] restricts the surface surf to be within the region reg.
 *                                       x   y   z
 *                   SliceVectorPlot3D[{v , v , v }, {surf , surf , …}, …] generates vector plots over several slice surfaces surf .
 * Usage:                                x   y   z        1      2                                                                i
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   Axes -> True
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> Automatic
 *                   Boxed -> True
 *                   BoxRatios -> {1, 1, 1}
 *                   BoxStyle -> {}
 *                   ClipPlanes -> None
 *                   ClipPlanesStyle -> Automatic
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   ControllerLinking -> False
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   EvaluationMonitor -> None
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotPoints -> Automatic
 *                   PlotRange -> {Full, Full, Full}
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionFunction -> (True & )
 *                   RotationAction -> Fit
 *                   SphericalRegion -> Automatic
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TouchscreenAutoZoom -> False
 *                   VectorColorFunction -> None
 *                   VectorColorFunctionScaling -> True
 *                   VectorPoints -> Automatic
 *                   VectorScale -> Automatic
 *                   VectorStyle -> Automatic
 *                   ViewAngle -> Automatic
 *                   ViewCenter -> Automatic
 *                   ViewMatrix -> Automatic
 *                   ViewPoint -> {1.3, -2.4, 2.}
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 *                   ViewVertical -> {0, 0, 1}
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SliceVectorPlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/SliceVectorPlot3D.html
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
fun sliceVectorPlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SliceVectorPlot3D", arguments.toMutableList(), options)
}
