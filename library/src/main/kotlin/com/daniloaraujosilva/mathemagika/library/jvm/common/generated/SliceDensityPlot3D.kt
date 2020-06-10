package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SliceDensityPlot3D
 * 
 * Full name:        System`SliceDensityPlot3D
 * 
 *                   SliceDensityPlot3D[f, surf, {x, x   , x   }, {y, y   , y   }, {z, z   , z   }] generates a density plot of f over the slice surface surf as a function of x, y, and z.
 *                                                    min   max        min   max        min   max
 *                   SliceDensityPlot3D[f, surf, {x, y, z} ∈ reg] restricts the surface to be within region reg.
 *                   SliceDensityPlot3D[f, {surf , surf , …}, …] generates density plots over several slices. 
 * Usage:                                       1      2
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
 *                   ClippingStyle -> None
 *                   ClipPlanes -> None
 *                   ClipPlanesStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   ControllerLinking -> False
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Exclusions -> Automatic
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   MaxRecursion -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotPoints -> Automatic
 *                   PlotRange -> {Full, Full, Full, Automatic}
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
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
 *                   VertexNormals -> Automatic
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
 *                   local: paclet:ref/SliceDensityPlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/SliceDensityPlot3D.html
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
fun sliceDensityPlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SliceDensityPlot3D", arguments.toMutableList(), options)
}
